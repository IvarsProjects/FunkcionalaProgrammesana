(use 'clojure.string)

(def Studenti ["Inese" "Vasja" "Petja" "Natasha" "Anja" "Lauris" "Sandra" "Krisjanis"] )

(def Atzimes [10 8 4 7 10 6 8 9] )

(def KopSaraksts (map vector Studenti Atzimes))

(def Sum (num 0))

(def Skaits (num 0))

(dotimes [i (count KopSaraksts)] (println(if (= (ends-with?(first (nth KopSaraksts i)) "a") true) (and(def Sum(+ Sum (second (nth KopSaraksts i))))(def Skaits (+ Skaits 1))))))
(float(/ Sum Skaits))