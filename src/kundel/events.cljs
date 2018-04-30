(ns kundel.events)

;; Fire an event out of the element.

(defn fire-event [element attrs]
  (let [some-text (js->clj @(get attrs "some-text")) ;; get property from custom element
        event (.createEvent js/document "Event")]    ;; new event to fire from custom element
    (.log js/console "created event :: " event)
    (.log js/console "against element :: " element)
    (.initEvent event "my-event" true true)
    (aset event "detail" (str "Text added by event to " some-text)) ;; add some detail text to event
    (.dispatchEvent element event)))                                ;; fire event
