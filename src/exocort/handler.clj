(ns exocort.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [net.cgrand.enlive-html :as enlive]))

(def index (enlive/html-resource "public/hello.html"))


(defroutes app-routes
  (GET "/" [] (enlive/emit* index))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
