(ns url2slack_cljs.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [url2slack_cljs.option-storage-test]))

(doo-tests 'url2slack_cljs.option-storage-test)
