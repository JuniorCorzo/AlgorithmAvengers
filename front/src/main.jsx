import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from "react-router-dom";

import 'bootstrap/dist/css/bootstrap.min.css';
import Home from "./pages/home/Home";
import Error from './routes/Error';
import Login from './pages/login/Login';
import Register from './pages/register/Register';

const router = createBrowserRouter([
  {
    path: "/",
    element: <Home />,
    error: <Error />,
  },
  {
    path: "/login",
    element: <Login/>,
    error: <Error />,
  },
  {
    path: "/register",
    element: <Register/>,
    error: <Error />,
  }
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <RouterProvider router={router} />
);
