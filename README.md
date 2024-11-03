<body>

<h1>📚 BookStoreAPI</h1>
<p>A simple REST API built with Spring Boot, H2 Database, and Java, allowing CRUD operations on a collection of books.</p>

<h2>📋 Features</h2>
<ul>
  <li>Retrieve all books</li>
  <li>Retrieve a book by its ID</li>
  <li>Add a new book</li>
  <li>Update an existing book</li>
  <li>Delete a book</li>
</ul>

<h2>🛠️ Setup Instructions</h2>

<h3>Prerequisites</h3>
<ul>
  <li>Java 11 or higher</li>
  <li>IntelliJ IDEA or any preferred Java IDE</li>
  <li>Postman or any API testing tool</li>
</ul>

<h3>Steps to Run</h3>
  <li>Open the project in IntelliJ IDEA.</li>
  <li>Run the application.</li>
  <li>Access the API at <code>http://localhost:8080/api/books</code>.</li>
</ol>

<h2>📚 API Endpoints</h2>
<h3>Get All Books</h3>
<pre><code>GET /api/books</code></pre>
<p>Retrieve a list of all books.</p>

<h3>Get Book by ID</h3>
<pre><code>GET /api/books/{id}</code></pre>
<p>Retrieve a book by its ID.</p>

<h3>Add a New Book</h3>
<pre><code>POST /api/books</code></pre>
<p>Add a new book with a JSON body.</p>

<h3>Update an Existing Book</h3>
<pre><code>PUT /api/books/{id}</code></pre>
<p>Update a book's details by ID.</p>

<h3>Delete a Book</h3>
<pre><code>DELETE /api/books/{id}</code></pre>
<p>Delete a book by its ID.</p>

<h2>📂 Project Structure</h2>
<ul>
  <li><code>controller/</code> - Contains the REST controller classes</li>
  <li><code>service/</code> - Contains the service layer for business logic</li>
  <li><code>repository/</code> - Contains the JPA repository interfaces</li>
  <li><code>model/</code> - Contains the entity classes</li>
</ul>

<h2>📄 License</h2>
<p>This project is licensed under the MIT License.</p>

</body>
</html>
