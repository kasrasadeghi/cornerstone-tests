(def i (params (a i32)) i32
  (return a i32))

(def main (params) i32
  (let ignore
    (call i (types i32) i32 (args
      (call i (types i32) i32 (args
        (call i (types i32) i32 (args 7)))))))
  (return 0 i32))