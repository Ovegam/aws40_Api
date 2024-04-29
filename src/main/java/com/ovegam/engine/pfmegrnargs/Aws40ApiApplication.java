package com.ovegam.engine.pfmegrnargs;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import java.lang.String;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SecurityScheme(
    name = "ovegam",
    scheme = "bearer",
    type = SecuritySchemeType.HTTP,
    in = SecuritySchemeIn.HEADER
)
public class Aws40ApiApplication {
  public static void main(String[] args) {
    SpringApplication.run(Aws40ApiApplication.class,args);
  }
}
