(defproject exocort "0.1.0-SNAPSHOT"
  :description "A small note taking app"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [enlive "1.1.5"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler exocort.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
