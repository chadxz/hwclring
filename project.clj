(defproject hwclring "1.0.0-SNAPSHOT"
  :description "A hello world ring application"
  :url "https://github.com/chadxz/hwclring.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot hwclring.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
