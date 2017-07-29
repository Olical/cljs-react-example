(ns cljs-react.core
  (:require [react :as react]
            [react-dom :as react-dom]))

(react-dom/render (react/createElement "div" nil "Hello, World!")
                  (js/document.getElementById "mount"))
