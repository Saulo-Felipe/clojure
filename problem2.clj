(defn count-item [item lista]
  (count (filter #(= % item) lista)))

(println (count-item 2 [2 3 4 5 2]))
