;; exemplo: questão 4

(defn determinante-3x3 [matriz]
  (let [[[a b c]
         [d e f]
         [g h i]] matriz]

    (- 
     (+ (* a e i) (* b f g) (* d h c)) 
     (* c e g) (* b d i) (* f h a))))

(println (determinante-3x3 [[1 2 3] [4 5 6] [7 8 9]]))
