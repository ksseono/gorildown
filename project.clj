(defproject gorildown "0.1.0-SNAPSHOT"
  :description "Write raw Markdown from Gorilla REPL"
  :url "https://github.com/ksseono/gorildown"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [cheshire "5.8.0"]
                 [hickory "0.7.1"]]
  :main gorildown.core)
