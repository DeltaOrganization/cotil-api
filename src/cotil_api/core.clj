(ns cotil-api.core
  (:require [cotil-api.database :as db])
  (:gen-class))

(defn -main [& args]
  (load-file "src/cotil_api/core.clj")
  (db/setup-database)
  (println "Fodase")
  (println "Hello, World!"))
