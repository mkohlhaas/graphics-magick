(ns graphics-magick.pixel
  (:import
   [java.lang.foreign Arena]
   [magick magick_wand]))

;; http://www.graphicsmagick.org/wand/pixel_wand.html#clonepixelwand clone-pixel-wand
;; http://www.graphicsmagick.org/wand/pixel_wand.html#clonepixelwands clone-pixel-wands

;; http://www.graphicsmagick.org/wand/pixel_wand.html#destroypixelwand
;; TODO: write with-macro for new-pixel-wand and destroy-pixel-wand
(defn destroy-pixel-wand [wand]
  (magick_wand/DestroyPixelWand wand))

;; http://www.graphicsmagick.org/wand/pixel_wand.html#newpixelwand
(defn new-pixel-wand []
  (magick_wand/NewPixelWand))

;; http://www.graphicsmagick.org/wand/pixel_wand.html#newpixelwands new-pixel-wands
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetexception get-exception
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetblack get-black
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetblackquantum get-black-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetblue get-blue
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetbluequantum get-blue-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetcolorasstring get-color-as-string
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetcolorcount get-color-count
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetcyan get-cyan
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetcyanquantum get-cyan-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetgreen get-green
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetgreenquantum get-green-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetmagenta get-magenta
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetmagentaquantum get-magenta-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetopacity get-opacity
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetopacityquantum get-opacity-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetred get-red
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetredquantum get-red-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetyellow get-yellow
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelgetyellowquantum get-yellow-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetblack set-black
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetblackquantum set-black-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetblue set-blue
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetbluequantum set-blue-quantum

;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetcolor
;; TODO: throw exception
(defn set-color [wand color]
  (let [arena (Arena/ofConfined)
        color (.allocateFrom arena color)])
  (magick_wand/PixelSetColor wand color))

;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetcolorcount set-color-count
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetcyan set-cyan
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetcyanquantum set-cyan-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetgreen set-green
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetgreenquantum set-green-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetmagenta set-magenta
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetmagentaquantum set-magenta-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetopacity set-opacity
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetopacityquantum set-opacity-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetquantumcolor set-quantum-color
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetred set-red
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetredquantum set-red-quantum
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetyellow set-yellow
;; http://www.graphicsmagick.org/wand/pixel_wand.html#pixelsetyellowquantum set-yellow-quantum
