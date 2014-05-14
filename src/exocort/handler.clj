(ns exocort.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [net.cgrand.enlive-html :as enlive]))

(defn st-render
  [static]
  (enlive/emit*
   (enlive/html-resource
    (clojure.string/join "" ["public/" static ".html"]))))


(defroutes app-routes
  (GET "/" [] (st-render "hello"))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))

