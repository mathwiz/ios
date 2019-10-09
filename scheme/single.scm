(define last1 (lambda (lst)
  (car (reverse lst))))

(define single? (lambda (lst)
  (and (pair? lst) (null? (cdr lst)))))

(define append1 (lambda (lst obj)
  (append lst (list obj))))

;; This only works with mutable cons cells
(define conc1 (lambda (lst obj)
  (if (null? (mcdr lst))
      (set-mcdr! lst obj)
      (conc1 (mcdr lst) obj))))

(define mklist (lambda (obj)
  (if (list? obj) obj (list obj))))

