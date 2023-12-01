(def myList (list 3 4 20 6 8 11 13 2 3 5 20 3))

(defn somaNumeroComCondicao [lista soma]
  (if (empty? lista)
    soma

    (if (= (first lista) 3) ; condition
      (somaNumeroComCondicao (rest lista) soma)
      (somaNumeroComCondicao (rest lista) (+ soma (first lista))))))

(println (str "soma: " (somaNumeroComCondicao myList 0)))