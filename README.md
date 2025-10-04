# graphics-magick

FFI to [GraphicsMagick's C Wand](http://www.graphicsmagick.org/wand/wand.html).


```shell
jextract --dump-includes includes.sh --header-class-name magick_wand -l :/usr/lib/libGraphicsMagickWand.so -I /usr/include/GraphicsMagick/ --output src -t magick "<wand/magick_wand.h>"
jextract @resources/includes.sh --header-class-name magick_wand -l :/usr/lib/libGraphicsMagickWand.so -I /usr/include/GraphicsMagick/ --output src -t magick "<wand/magick_wand.h>"
```

- TODO: change library to `-l GraphicsMagickWand`

## License

Copyright © 2025 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
