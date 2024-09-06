document.addEventListener("DOMContentLoaded", () => {
    const bookList = document.getElementById("book-list");
    
    fetch('/api/books')
        .then(response => response.json())
        .then(books => {
            books.forEach(book => {
                const bookDiv = document.createElement('div');
                bookDiv.classList.add('book');
                bookDiv.innerHTML = `
                    <h3>${book.title}</h3>
                    <p><strong>Autor:</strong> ${book.author}</p>
                    <p><strong>ISBN:</strong> ${book.isbn}</p>
                    <p><strong>Data de Publicação:</strong> ${new Date(book.publishDate).toLocaleDateString()}</p>
                    <p><strong>Preço:</strong> $${book.price.toFixed(2)}</p>
                `;
                bookList.appendChild(bookDiv);
            });
        });
});
