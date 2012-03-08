(defproject wepl "0.1.0-SNAPSHOT"
  :description "Web-based Clojure REPL"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [compojure "1.0.1"]
                 [hiccup "0.3.8"]]
  :dev-dependencies [[lein-ring "0.5.4"]]
  :ring {:handler wepl.handler/main})