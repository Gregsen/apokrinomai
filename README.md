# Apokrinomai
## a simple mockserver

Apokrinomai is a simple mockserver that responds to requests with predefined reponses.

### TODO:

- read responses on the fly from file (also: add dynamically new endpoints)
- cache reponses
- endpoint for adding new responses
- check for headers

### nice to have:

- choose randomly from multiple responses for one endpoint
- check request for fields

### functionality:

call the ```/api/``` endpoint and add your own endpoint (e.g. ```/api/checkout```) and get
a predefined response (json from a file). It should read the a config file that has 

```
checkout:
    path/to/file.json
```