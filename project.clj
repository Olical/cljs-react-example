(defproject cljs-react "0.1.0-SNAPSHOT"
  :description "Simple example of using React from ClojureScript directly"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.854"]]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.11"]]
  :profiles {:dev {:dependencies [[figwheel-sidecar "0.5.11"]]}}
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:output-to "out/main.js"
                                   :output-dir "out"
                                   :optimizations :none
                                   :main "cljs-react.core"}}]})
