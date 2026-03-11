/*
 * TODO: BlackjackController.java
 * Purpose:
 * - Expose REST endpoints for blackjack gameplay.
 *
 * Planned endpoints:
 * - POST /api/blackjack/games            -> start game
 * - POST /api/blackjack/games/{id}/hit   -> player hit
 * - POST /api/blackjack/games/{id}/stand -> player stand
 * - GET  /api/blackjack/games/{id}       -> current game state
 *
 * Error handling:
 * - 400 bad request (invalid bet/input)
 * - 404 not found (unknown game id)
 * - 409 conflict (action not allowed in current state)
 */
