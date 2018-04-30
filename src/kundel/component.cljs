(ns kundel.component
  (:require
    [reagent.core :as r]
    [kundel.events :as events]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; reagent component rendering
;;
;; (all yours to change)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Top level Reagent render.
;;
;; 'element' :: JavaScript 'this' of our element
;; 'attrs' :: map of attributes by name; value is a r/atom for attribute
(defn render [element attrs]
  [:div
   [:h1 {:on-click #(events/fire-event element attrs)} "CLICK ME"]
   [:p "Click above."]
   [:p "some-text value: " @(get attrs "some-text")]])
