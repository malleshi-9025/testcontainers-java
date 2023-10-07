GenericContainer redis = new GenericContainer("redis:5.0.3-alpine")
    .withExposedPorts(6379);
