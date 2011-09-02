## Fork of the [Play!](http://www.playframework.org) [Log4Play Module](https://github.com/feliperazeek/log4play)

Pretty much the same as the Log4Play Module with minor module structure changes I require and
some cleanups here and there.

### How to use:

##### Enable the Log4Play module for the application

In the `/conf/dependencies.yml` file, enable the Log4Play module by adding a line after require:
`- play -> log4play 0.5

##### Import default Log4Play routes

In the conf/routes file, import the default module routes by adding this line:
`*     /admin           module:log4play`
