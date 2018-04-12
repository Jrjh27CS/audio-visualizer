(defproject audio-visualizer "0.1.0-SNAPSHOT"
  :description "Audio Visualizer made in clojure using seesaw library"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main ^:skip-aot audio-visualizer.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
