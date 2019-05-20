(ns ultimate-bias-picker.core)


(println "Welcome to ultimate bias picker! I'm going to ask you the name of your top 3 biases and then will pick an ultimate for you :D Who do you pick first? ")

(def one (read-line))

(println "Second? ")

(def two (read-line))

(println "Third? ")

(def third (read-line))

(def combined [one two third])

(println (nth (rand-int) combined))
