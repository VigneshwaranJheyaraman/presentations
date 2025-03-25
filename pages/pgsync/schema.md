---
layout: Pgsync
zoom: 0.48
transition: slide-left
---


# Schema defintion

```json
[
    {
        "database": "<Postgres database name>",
        "index": "<Elasticsearch/OpenSearch index name>",
        "setting": "<Elasticsearch/OpenSearch setting>",
        "plugins": ["<Plugin A Python Classname>", "<Plugin B Python Classname>"...],
        "pipeline": "<pipeline-name setup in elastic / opensearch>",
        "routing": "<routing-formula-to-push-the-document-to-specific-elasticOrOpensearch-shard-formula-to-push-the-document-to-specific-elasticOrOpensearch-shard-formula-to-push-the-document-to-specific-elasticOrOpensearch
        -shard-formula-to-push-the-document-to-specific-elasticOrOpensearch-shard>",
        "nodes": {
            "table": "<root table name>",
            "schema": "<schema name>",
            "columns": [
                "<column 1>",
                "<column 2>",
                ...
            ],
            "children": [
                {
                    "table": "<child table name>",
                    "columns": [
                        "<column 1>",
                        "<column 2>",
                        ...
                    ],
                    "label": "<document label name>",
                    "relationship": {
                        "variant": "object" | "scalar",
                        "type": "one_to_one" | "one_to_many",
                        "through_tables": [
                            "<through table name>"
                        ]
                    },
                    "children": [],
                    "transform": {
                        "rename": {
                            "<old column 1>": "<new column 1>",
                            "<old column 2>": "<new column 2>",
                            ...
                        },
                        "mapping": {
                            "<new column 1>": {"<data type>"},
                            "<new column 2>": {"<data type>"},
                            ...
                        },
                        "concat": {
                            "columns": ["column 1", "column 2" ...],
                            "destination": "<new column 1>",
                            "delimiter": "<char>"
                        }
                    }
                },
                ...
            ]
        }
    }
]
```
