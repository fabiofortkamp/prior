(ns prior.tasks)

(def study-sources
  ["Book - Object-Oriented Software Construction",
   "Book - Clean Architecture",
   "Book - Functional Design"
   "Alura - Clojure: Programação Funcional"])

(def projects 
  [
   "Python Project 2",
   "Python Project 1",
   "Clojure Project 'prior'"])

(defn book? [source]
  (= "Book" (subs source 0 4)))

(defn course? [source]
  (= (subs source 0 5) "Alura"))

(def OOSC-chapters-to-study (range 11 19))

(def alura-clojure-1-lectures (range 5 7))

(def clean-architecture-chapters-to-study (range 15 35))

(defn study-oosc-chapter [ch]
  (str "Study Chapter " ch " - OOSC"))

(defn watch-alura-clojure-1-lecture [lecture]
  (str "Watch lecture" lecture " - Alura Clojure 1 course"))

(def linting-tasks ["Lint inputs.py", "Lint solver.py"])

(def refactor-project-2-track
  (conj (mapv study-oosc-chapter OOSC-chapters-to-study)))
     
