(defn nesimo-termo [num1 num2 n]
  (let [soma (+ num1 num2)]
    (if (<= (- n 2) 0)
      soma
      (nesimo-termo num2 soma (dec n)))))

(defn fibonacci [n]
  (if (< n 1) 0 (nesimo-termo 0 1 n)))

(println (fibonacci 1))