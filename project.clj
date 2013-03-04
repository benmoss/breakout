(defproject breakout "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj"]

  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
                 [domina "1.0.1"]]

  :plugins [[lein-cljsbuild "0.3.0"]
            [lein-ring "0.8.2"]]

  :ring {:handler breakout.core/handler}
  :cljsbuild
  {:builds
   [{:source-paths ["src/cljs"]
     :id "dev"
     :compiler
     {:output-to "resources/public/js/dev.js"}}
    {:source-paths ["src/cljs"]
     :id "prod"
     :compiler
     {:output-to "resources/public/js/prod.js"
      :optimizations :advanced
      :pretty-print false}}]})
