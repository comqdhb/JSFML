SFML Headers and Binaries
=========================
JSFML always binds to a certain version of SFML. It is *not* recommended to build JSFML against a different SFML version or use a different one, because API changes in SFML might not be reflected in the Java binding yet. This will cause serious problems, in most causes in the form of crashes.

Therefore, the headers and binary builds of the latest supported SFML version and for all supported systems are checked into this repository. This will avoid problems when there are SFML updates, but no JSFML updates yet.


Current Version
---------------
The currently checked in version of SFML includes and binaries is:

`2.2` [fc850ed99fc3e52e16c7d9d1bf71daf92cbe5f76](https://github.com/LaurentGomila/SFML/commit/fc850ed99fc3e52e16c7d9d1bf71daf92cbe5f76) as of December 18, 2014`.

License
-------
The following license applies to the SFML headers:

    SFML - Copyright (C) 2007-2014 Laurent Gomila - laurent.gom@gmail.com

    This software is provided 'as-is', without any express or
    implied warranty. In no event will the authors be held
    liable for any damages arising from the use of this software.

    Permission is granted to anyone to use this software for any purpose,
    including commercial applications, and to alter it and redistribute
    it freely, subject to the following restrictions:

    1. The origin of this software must not be misrepresented;
       you must not claim that you wrote the original software.
       If you use this software in a product, an acknowledgment
       in the product documentation would be appreciated but
       is not required.

    2. Altered source versions must be plainly marked as such,
       and must not be misrepresented as being the original software.

    3. This notice may not be removed or altered from any
       source distribution.