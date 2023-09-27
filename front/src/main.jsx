import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from "react-router-dom";

import 'bootstrap/dist/css/bootstrap.min.css';
import Home from "./pages/home/Home";
import Error from './routes/Error';
import Login from './pages/login/Login';
import Register from './pages/register/Register';
import Resources from './pages/resources/Resources';
import Filter from './pages/filter/Filter';

const router = createBrowserRouter([
  {
    path: "/",
    element: <Home />,
    error: <Error />,
  },
  {
    path: "/login",
    element: <Login />,
    error: <Error />,
  },
  {
    path: "/register",
    element: <Register />,
    error: <Error />,
  },
  {
    path: "/resources",
    element: <Resources />,
    error: <Error />,
  },
  {
    path: "/filter",
    element: <Filter />,
    error: <Error />,
  },
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <RouterProvider router={router} />
);
