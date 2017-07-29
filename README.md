# cljs-react

Simple example of using React from ClojureScript directly. Using the new `node_modules` integration found in version `1.9.854`.

## Usage

 * Run `yarn` to fetch the `node_modules`.
 * Run `server.sh` to launch a Python 3 web server which hosts the HTML at `http://localhost:8000`, obviously you can serve it any way you see fit.
 * Run `lein figwheel` to start the build server and enable hot code reloading.

## To do

 * [x] Get spacemacs hooked in to the figwheel REPL. ([solution](https://github.com/bhauman/lein-figwheel/wiki/Using-the-Figwheel-REPL-within-NRepl))
 * [ ] Remove dependency on manually running yarn/npm if possible.
 * [ ] Configure for production and development as if this was a real project.
