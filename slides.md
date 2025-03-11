---
# You can also start simply with 'default'
theme: seriph
# random image from a curated Unsplash collection by Anthony
# like them? see https://unsplash.com/collections/94734566/slidev
background: https://img.freepik.com/free-vector/gradient-coding-logo-template_23-2148809439.jpg
# some information about your slides (markdown enabled)
title: VickySuraj's Presntations
author: VigneshwaranJheyaraman
presenter: true
# apply unocss classes to the current slide
class: text-center
# https://sli.dev/features/drawing
drawings:
  enabled: dev
  presenterOnly: true 
# slide transition: https://sli.dev/guide/animations.html#slide-transitions
transition: slide-up
# enable MDC Syntax: https://sli.dev/features/mdc
# markdown components syntax
mdc: true
# export as png
export: pdf
---

# Goto Presentations

<div>
  <Link to="/clojure101" title="Clojure 101" />
  <br />
  <Link to="/elastic101" title="Elastic & stuff" />
</div>

---
routeAlias: "clojure101"
title: "Clojure 101 & Stuff"
src: ./pages/clojure_101/README.md
---


---
src: ./pages/clojure_101/snippets.md
routeAlias: "clojure-snippets"
---

---
src: ./pages/elastic/index.md
routeAlias: "elastic101"
---

---
src: ./pages/elastic/what_is_elastic.md
routeAlias: "elasticIntro"
---

---
src: ./pages/elastic/elastic_flow.md
routeAlias: "elasticFlow"
---

---
src: ./pages/elastic/indices.md
routeAlias: "elasticIndices"
---

---
src: ./pages/elastic/schema_and_query.md
routeAlias: "elasticSchema"
---

---
src: ./pages/elastic/pgsync.md
routeAlias: "elasticTools"
---
