(ns graphics-magick.core
  (:import
   [magick magick_wand]
   [java.lang.foreign MemorySegment]))

;; TODO: write a with-magick macro for automatic init and destroy of magick

#_{:clojure-lsp/ignore [:clojure-lsp/unused-public-var]}
;; http://www.graphicsmagick.org/api/magick.html#initializemagick
(defn initialize-magick []
  (magick_wand/InitializeMagick MemorySegment/NULL))

#_{:clojure-lsp/ignore [:clojure-lsp/unused-public-var]}
;; http://www.graphicsmagick.org/api/magick.html#destroymagick
(defn destroy-magick []
  (magick_wand/DestroyMagick))
