;; Encontrar o número de ocorrências de uma substring em uma string

(defn count-occurrences [sub-str string]
  (count (re-seq (re-pattern (str sub-str)) string)))

(println (count-occurrences "a" "Hello World!"))