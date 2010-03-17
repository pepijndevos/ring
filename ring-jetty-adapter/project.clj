(defproject ring/ring-jetty-adapter "0.2.0-RC1"
  :description "Ring Jetty adapter."
  :url "http://github.com/mmcgrana/ring"
  :dependencies [[ring/ring-core "0.2.0-RC1"]
                 [ring/ring-servlet "0.2.0-RC1"]
                 [org.mortbay.jetty/jetty "6.1.14"]
                 [org.mortbay.jetty/jetty-util "6.1.14"]]
  :dev-dependencies [[org.clojars.mmcgrana/lein-clojars "0.5.0"]])