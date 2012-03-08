(ns wepl.handler
  (:use compojure.core)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [clojure.java.io :as io]))

(defroutes main-routes
  (GET "/" []
    (io/resource "wepl/public/index.html"))
  (route/resources "/" {:root "wepl/public"})
  (route/not-found "Not found"))

(def main
  (handler/site main-routes))