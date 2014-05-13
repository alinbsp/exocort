(ns exocort.templates
  (:require [net.cgrand.enlive-html :refer [deftemplate content]]))

(deftemplate tpl-hello "public/hello.html"
  [value]
  [:#message] (content value))