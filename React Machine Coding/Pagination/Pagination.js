import { useEffect, useState } from "react";

export default function Pagination() {
  const [product, setProduct] = useState([]);
  const [page, setPage] = useState(1);

  const fetchProduct = async () => {
    const res = await fetch("https://dummyjson.com/products?limit=100");
    const data = await res.json();

    if (data && data.products) {
      setProduct(data.products);
    }
  };

  useEffect(() => {
    fetchProduct();
  }, []);

  selectedPageHandler = (selectedPage) => {
    if (
      selectedPage >= 1 &&
      selectedPage <= product.length / 10 &&
      selectedPage !== page
    ) {
      setPage(selectedPage);
    }
  };

  return (
    <div>
      {product.length > 0 && (
        <div className="products">
          {product.slice(page * 10 - 10, page * 10).map((prod) => (
            <span className="products__single" key={prod.id}>
              <img
                src={prod.thumbnail}
                alt={prod.title}
                className="prod__image"
              />
              <span>{prod.title}</span>
            </span>
          ))}
        </div>
      )}

      {product.length > 0 && (
        <div className="pagination">
          <span
            onClick={() => selectedPageHandler(page - 1)}
            className={page === 1 ? "pagination__disable" : ""}
          >
            ⬅️
          </span>
          {[...Array(product.length / 10)].map((_, i) => (
            <span
              key={i}
              className={page === i + 1 ? "selected__page" : ""}
              onClick={() => selectedPageHandler(i + 1)}
            >
              {i + 1}
            </span>
          ))}
          <span
            className={
              page === product.length / 10 ? "pagination__disable" : ""
            }
            onClick={() => selectedPageHandler(page + 1)}
          >
            ➡️
          </span>
        </div>
      )}
    </div>
  );
}