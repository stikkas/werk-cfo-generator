## Generator of werks and cfos entities for creating of internships.

The service exposes API:
 * POST /api/cfos - generates a cfo entity and sends message with it into `org_cdc_polka_test.public.ucfo` topic
 * POST /api/werks - generates a werk entity and sends message with it into `org_cdc_polka_test.public.uwerks` topic

The service listens on 8080 port by default and expects that there is a kafka bootstrap-server on kafka:9092.

This is a spring application and therefore you can use the arguments of a command line to change default settings.

To change the default port - *--server.port*

To change bootstrap-server - *--spring.kafka.bootstrap-servers*

## Usage

You can use either any tcp client to use API or the application presents UI - http://localhost:8080/

## Docker hub

There is a docker image - `stikkas/werk-cfo-generator`