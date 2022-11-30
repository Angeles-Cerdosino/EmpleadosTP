package EmpleadosTP.LCIV.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = {"EmpleadosTP.LCIV.repositories"})
public class DataSourceConfig {

    @Bean
    @Qualifier("datasource")
    @Profile({"!local & !integration_test"})
    public DataSource getDataSource(
            final @Value("${spring.datasource.url}") String url,
            final @Value("${spring.datasource.username}") String user,
            final @Value("${spring.datasource.password}") String password
    )
            throws ExceptionInInitializerError {
        return DataSourceBuilder.create()
                .url(String.format(url))
                .username(user)
                .password(password)
                .build();
    }
}
