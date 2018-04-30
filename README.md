# W3C Custom Element in ClojureScript

Template leveraging Reagent (https://github.com/reagent-project/reagent).

The custom element's name and attributes are configured as per *src/kundel/element.cljs*.

The custom element's Reagetn source code is in *src/kundel/component.cljs*.

Events are free-form, by convention, not configured anywhere.  See *src/kundel/events.cljs*.

The *register* export out of *element.cljs* registers your new custom element  for
use in the DOM.

Once built--see below--the element will be rendered to a JavaScript in
*resources/public/js/element.js*.

The *resources/public/index.html* is a demo of the custom element.

## Dev Run Application:

```
lein clean
lein figwheel dev
```

Figwheel will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:3449](http://localhost:3449).

## Production Build


To compile clojurescript to javascript:

```
lein clean
lein cljsbuild once min
```

## Connect to REPL (command-line) from IntelliJ

Our 'project.clj' sets up figwheel :nrepl-port to 7002.

Create remote REPL run configuration to 127.0.0.1:7002.

Once started paste the following in the IntelliJ REPL (Alt-8)

```
(use 'figwheel-sidecar.repl-api)
(cljs-repl)
```

## Run Unit Tests

The *dev* build compiles unit tests.

To run them, start the REPL:

```
lein figwheel dev
```

In the REPL source the test runner and run the tests:

```
    (in-ns 'kundel-runner')
    (require '[kundel.runner :as t] :reload)
    (t/run)
```
