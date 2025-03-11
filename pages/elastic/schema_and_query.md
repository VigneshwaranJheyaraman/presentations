---
layout: Elastic
zoom: 0.55
transition: slide-left
---

<template v-slot:left>

# Schema + Mapping

However `elastic` utilizes `NoSQL` and has `document-model` for better `index`ing,
`elastic` requires the expected data schema / expected fields to parse and handle.
This definition is called `schema`

```javascript
POST https://local-elastic/<index-name=imdb>/_mapping
{
  "imdb": {
    "mappings": {
      "properties": {
        "name": {
          "type": "text",
          "fields": {
            "keyword": {
              "type": "keyword"
            }
          }
        },
        "rating": {
          "type": "double"
        },
        "reviews": {
          "type": "array",
          "properties": {
            "review": {
              "type": "object",
              "properties": {
                "comment": {
                  "type": "text"
                },
                "rating": {
                  "type": "double"
                }
              }
            }
          }
        },
        "director": {
          "type": "object",
          "properties": {
            "name": {
              "type": "text"
            }
          }
        }
      }
    }
  }
}
```

</template>

<template v-slot:right>

# Mapping + transformation

`mapping` / `transformation` follows _Decorator pattern_ which intercepts the value and performs
the required _mapping-fn_ (**iff**) and then persists them in `index`

- **Elastic Schema**: The dynamic structure of Elasticsearch’s indexing system that allows it to handle diverse data types and formats.
- **Mapping**: The configuration that defines how documents are structured, what fields they contain, their types, and relationships between them.
- Together, these features enable Elasticsearch to efficiently index and search data while adapting to changing requirements.

```json
{
  "name": {
    "type": "text",
    "fields": {
      "keyword": {
        "type": "keyword"
      }
    }
  }
}
```

# Example document

```javascript
GET http://local-elastic/<index-name=imdb>/_doc/<godFather_ID>
{
    "name": "GodFather",
    "rating": 9.4,
    "reviews": [
    {
        "comment": "Vito Corleone: Look what they have done to my son :(",
        "rating": 10
    }
    ],
    "director": {
        "name": "Francis Ford"
    }
}
```

</template>
