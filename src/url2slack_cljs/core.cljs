(ns url2slack_cljs.core)

(enable-console-print!)

;; define your app data so that it doesn't get over-written on reload

;; (defonce app-state (atom {:text "Hello world!"}))


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)

(defn ^:export hello []
  (js/alert "Hello url2slack_cljs!"))
(set! (.-onload js/window) hello)
