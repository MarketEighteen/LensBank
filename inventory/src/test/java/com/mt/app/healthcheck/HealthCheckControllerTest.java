package com.mt.app.healthcheck;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HealthCheckControllerTest {

  private HealthCheckController healthCheckController = new HealthCheckController();

  @Test
  public void healthCheckShouldReturnUp() throws Exception {

    String result = healthCheckController.healthCheck();
    assertThat(result, is("up"));
  }
}
