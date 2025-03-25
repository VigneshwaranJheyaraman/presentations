---
layout: Neovim
zoom: 0.7
transition: slide-left
---

<template v-slot:left>

# VIM motions

* `motion` as the name literal meaning is to change position, i.e., _velocity of the virtue
changes causing disruption of its inertia_

* In `VIM` world, motions are the key for better productivity `VIM` allows developer
to move around _buffer_, _windows_ and _tabs_ efficiently

## Directional motions

* `VIM` natively makes use of _keyboard layout_ and identified that
`h`, `j`, `k` and `l` keys are the much better keys for movement rather then arrow keys

* So with native VIM, all the movements _can_ be done using these keys

`h` -> left
`l` -> right
`j` -> up
`k` -> down

</template>

<template v-slot:right>

## File based motions

* Now as mentioned before the _idea_ is to avoid mouse usage, thus `VIM` enables
keystrokes for moving within a `file`

* `gg` goes to top of file
* `G` goes to bottom of the file
* `w` goes to the next word
* `b` goes to the previous word
* `%` goes to the enclosing paranthesis

</template>

<template v-slot:default>

## Motions + numbers

* As of most of us coming from _C_ / _assembly_ background, you guys are aware of
`GOTO` command which jumps to register based on the label

* Similarily `VIM` enables the _labelling_ concept instead with _numbers_ because _numbers never lie_

* Now _all the above seen motions_ can be prefixed with the `number` to modify its
behaviour

  * Example:
1. I want to `jump` 10 words ahead, then instead of pressing `w` 10 times I can 
use `10w` directly which jumps be 10 words ahead
* Similarily I want to go 30lines below, the instead of _pressing `k` 30 times_ (don't use arrow-keys_
I  can type 30k which moves 30 lines down

</template>
