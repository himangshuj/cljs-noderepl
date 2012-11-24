(defproject org.bodil/lein-noderepl "0.1.1"
  :description "Leiningen plugin for launching a Node.js CLJS REPL"
  :url "https://github.com/bodil/cljs-noderepl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [lein-cljsbuild "0.2.9"]
                 [leinjacker "0.4.0"]]
  :eval-in-leiningen true)