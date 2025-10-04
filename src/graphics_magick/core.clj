(ns graphics-magick.core
  (:import
   [magick magick_wand]
   [java.lang.foreign MemorySegment]))

;; TODO: write a with-magick macro for automatic init and destroy of magick

;; http://www.graphicsmagick.org/api/magick.html#initializemagick
(defn initialize-magick []
  (magick_wand/InitializeMagick MemorySegment/NULL))

;; http://www.graphicsmagick.org/api/magick.html#destroymagick
(defn destroy-magick []
  (magick_wand/DestroyMagick))
