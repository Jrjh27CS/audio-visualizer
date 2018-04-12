(ns audio-visualizer.core
  (:require [quil.core :as q])
  (:gen-class))

(defn setup
  []
  (q/frame-rate 1)
  (q/background 200))

(defn draw
  []
  (q/stroke (q/random 255))
  (q/stroke-weight (q/random 10))
  (q/fill (q/random 255))

  (let [diam (q/random 100)
        x (q/random (q/width))
        y (q/random (q/height))]
    (q/ellipse x y diam diam)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (q/defsketch example
    :title "First try Friday"
    :settings #(q/smooth 2)
    :setup setup
    :draw draw
    :size [323 200]))
